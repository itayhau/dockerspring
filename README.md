# 1. create the spring project 
# 2. from source folder use the controllers
# 3. goto the workspace folder i.e. D:\javaide\workspace\demo-1
# 4. D:\javaide\workspace\demo-1> mvnw clean package
#    this will create the snapshot
# 5. copy the tagret folder (from 4) into a clean folder + create the Dockrfile there
# 6. from the clean folder: 
#    docker build . -t myjava
#    docker run -p 8087:8080 myjava
# 7. browse to http://localhost:8087/customer
