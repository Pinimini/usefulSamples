package org.example;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ChannelExample<T> {

    public static void main(String[] args) throws URISyntaxException, IOException {
        ChannelExample<String> channelExample = new ChannelExample<>();
        channelExample.go();
    }

    private void go() throws URISyntaxException, IOException {
        Path path = Paths.get(ClassLoader.getSystemResource("share.xml").toURI());
        try (FileChannel fileChannel = FileChannel.open(path)) {
            var buffer = ByteBuffer.allocate(10);

            int bytesCount;
            var sb = new StringBuilder();
            do {
                bytesCount = fileChannel.read(buffer);
                buffer.flip();
                while (buffer.hasRemaining()) {
                    sb.append((char) buffer.get());
                }
                buffer.flip();
            } while (bytesCount > 0);

            System.out.println(sb);
        }
    }
}
