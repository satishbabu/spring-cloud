# Spring Cloud Microservices - version 2 with updated components   
This project will have microservices using the latest spring cloud components


## Ports
| Service | Port |
| ------- | ---- |
| Limits Services | 8080 |
| Spring Config Server | 8888 |
| Currency Exchnage Service | 8000 |
| Currency Conversion Service | 8100 |
| Eureka - Naming server | 8761 |
| API Gateway | 8765 |


## Autoreload in intellij
During development it is good to hvae live reload when any file changes.  It is provided by spring dev tools.  For it to take effect we have to set the following in intellij.  Go to: file->settings->build,execution,deployment. Go to ->compiler->build project automatically.

## URLs
Currency Exchange service - http://localhost:8000/currency-exchange/from/USD/to/INR
Currency Conversion service - http://localhost:8100/currency-conversion/from/USD/to/INR/quantity/10
Eureka Naming server - http://localhost:8761/
API Gateway - http://localhost:8765/




Thru gateway
- http://localhost:8765/CURRENCY-EXCHANGE/currency-exchange/from/USD/to/INR
- http://localhost:8765/CURRENCY-CONVERSION/currency-conversion/from/USD/to/INR/quantity/10
- http://localhost:8765/CURRENCY-CONVERSION/currency-conversion-feign/from/USD/to/INR/quantity/10



Lower Case
- http://localhost:8765/currency-exchange/currency-exchange/from/USD/to/INR
- http://localhost:8765/currency-conversion/currency-conversion/from/USD/to/INR/quantity/10
- http://localhost:8765/currency-conversion/currency-conversion-feign/from/USD/to/INR/quantity/10



Custom Routes
- http://localhost:8765/currency-exchange/from/USD/to/INR
- http://localhost:8765/currency-conversion/from/USD/to/INR/quantity/10
- http://localhost:8765/currency-conversion-feign/from/USD/to/INR/quantity/10
- http://localhost:8765/currency-conversion-new/from/USD/to/INR/quantity/10
