# Vies Vat Checker
It is a easy to use service for checking EU vat against VIES Database (VAT Information Exchange System).

## Requirements
- Java 8

## Use
```java
CheckEUVatService check = new CheckEUVatService();
CheckEUVatResponse r = check.check("LU 26375245");

System.out.println(String.format("%s = %s\n%s\n%s\n%s", r.getVat(), r.isValid() ? "valid" : "invalid", r.getName(), r.getAddress(), r.getDate()));
```

### Output
```text
LU26375245 = valid
AMAZON EUROPE CORE S.A R.L.
5, RUE PLAETIS
L-2338  LUXEMBOURG
Tue Jan 17 00:00:00 CET 2017
```

## Installation
```
git clone https://github.com/awronski/vies-checker.git
mvn package install
```
