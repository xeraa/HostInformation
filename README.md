# Host Information

Retrieve the system's hostname, DNS TTL, and resolve a DNS entry (can be provided as an argument, defaults to google.com). The DNS entry is looped in 5s invervals to monitor for changes.

* Build: ``mvn clean package``
* Run: ``java -jar target/HostInformation.jar [yahoo.com]``
