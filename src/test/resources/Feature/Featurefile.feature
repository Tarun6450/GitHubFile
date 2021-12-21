Feature: Getting OrderID From Adactin Site.
Scenario Outline: Book the hotel and Get the order ID.

Given User is on Login page of Adactin
When User shoud enter User "<userName>" and password "<password>".
And User click ok on the login page once entered Password.
And User should search Hotel with "<Location>", "<Hotel>", "<RoomType>", "<NumberOfRoom>", "<CheckInDate>", "<CheckOutDate>", "<AdultsPerRoom>", and "<ChildrenPerRoom>".
And User Should click search button.
And User should select Hotel and Continue.
And User should book a hotel with details "<FirstName>", "<LastName>", "<Address>", "<CreditCardNo>", "<CreditCardType>", "<ExpiryMonth>", "<ExpiryYear>" and "<CVVNumber>".
And User click booknow button.
Then get Order ID and print in Console and close browser.


Examples:
|userName|password|Location|Hotel|RoomType|NumberOfRoom|CheckInDate|CheckOutDate|AdultsPerRoom|ChildrenPerRoom|FirstName|LastName|Address|CreditCardNo|CreditCardType|ExpiryMonth|ExpiryYear|CVVNumber|
|Monisha000096|Hello123|New York|Hotel Sunshine|Double|1 - One|20/12/2021|21/12/2021|2 - Two|1 - One|Shalini|Raj|OMR CrossStreet|2139403201941210|VISA|February|2022|283|
|Monisha000096|Hello123|New York|Hotel Sunshine|Double|1 - One|20/12/2021|21/12/2021|2 - Two|1 - One|Parvathy|Kumar|OMR CrossStreet|2139403201941210|VISA|February|2022|283|
|Monisha000096|Hello123|New York|Hotel Sunshine|Double|1 - One|20/12/2021|21/12/2021|2 - Two|1 - One|Nayan|Kumar|OMR CrossStreet|2139403201941210|VISA|February|2022|283|
|Monisha000096|Hello123|New York|Hotel Sunshine|Double|1 - One|20/12/2021|21/12/2021|2 - Two|1 - One|Sujatha|Kumar|OMR CrossStreet|2139403201941210|VISA|February|2022|283|
|Monisha000096|Hello123|New York|Hotel Sunshine|Double|1 - One|20/12/2021|21/12/2021|2 - Two|1 - One|Janani|Kumar|OMR CrossStreet|2139403201941210|VISA|February|2022|283|
|Monisha000096|Hello123|New York|Hotel Sunshine|Double|1 - One|20/12/2021|21/12/2021|2 - Two|1 - One|Murugan|Kumar|OMR CrossStreet|2139403201941210|VISA|February|2022|283|
|Monisha000096|Hello123|New York|Hotel Sunshine|Double|1 - One|20/12/2021|21/12/2021|2 - Two|1 - One|Alex|Kumar|OMR CrossStreet|2139403201941210|VISA|February|2022|283|
|Monisha000096|Hello123|New York|Hotel Sunshine|Double|1 - One|20/12/2021|21/12/2021|2 - Two|1 - One|Vijay|Kumar|OMR CrossStreet|2139403201941210|VISA|February|2022|283|
|Monisha000096|Hello123|New York|Hotel Sunshine|Double|1 - One|20/12/2021|21/12/2021|2 - Two|1 - One|Ram|Kumar|OMR CrossStreet|2139403201941210|VISA|February|2022|283|
|Monisha000096|Hello123|New York|Hotel Sunshine|Double|1 - One|20/12/2021|21/12/2021|2 - Two|1 - One|Ramesh|Kumar|OMR CrossStreet|2139403201941210|VISA|February|2022|283|



