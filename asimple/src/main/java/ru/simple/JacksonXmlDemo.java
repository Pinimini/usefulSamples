package ru.simple;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator;
import lombok.extern.slf4j.Slf4j;
import ru.simple.dto.SrvRequestAttorneyRq;

import java.util.UUID;

@Slf4j
public class JacksonXmlDemo {


    public static void main(String[] args) throws JsonProcessingException {
        XmlMapper xmlMapper = new XmlMapper();
        xmlMapper.configure(ToXmlGenerator.Feature.WRITE_XML_DECLARATION, true);

        SrvRequestAttorneyRq srvRequestAttorneyRq = SrvRequestAttorneyRq.builder()
                .requestID(UUID.randomUUID().toString())
                .currentAccountNumber("234234234234")
                .build();

        String s = xmlMapper.writeValueAsString(srvRequestAttorneyRq);
        log.info("jhsdfk \n{}", s);
    }

}
