market-pulse-cli

A Java console application that fetches and displays real-time gold, currency, and cryptocurrency prices by consuming a public REST API, built using the MVC architecture.

Features
Live prices for gold/coins, 25+ currencies, and 15+ cryptocurrencies
Consumes a real public REST API (no mock data)
Clean MVC architecture with a dedicated service layer
Tech Stack
Java 25
java.net.http.HttpClient for HTTP communication
Jackson (jackson-databind) for JSON parsing
Maven for dependency management
Data source: brsapi.ir (free, no API key required)
Architecture
model/       → Data classes matching the JSON response
service/     → Fetches data via HTTP and deserializes JSON
controller/  → Coordinates service and view
view/        → Console output only
exception/   → Custom exception for API/network failures
How to Run
mvn clean install

Then run the Main class.
