date
for run in {1..100000}; do
  curl -s "http://localhost:8080/data-mono/$run" > /dev/null
done
date