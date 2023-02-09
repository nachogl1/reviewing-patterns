**Information about the kata:**
*This kata aims for the developer to use Visitor Pattern. Behavioural pattern that allows you to adapt an algorithm
depending on the target. An example would be to send customise messages depending on the target of the message*

# Cool Virtual Post Service

Your service targets different type of clients:
- Individual
- Private Institutions
- Public Institutions

Your company create customised Christmas messages depending on the type of client receiving the message.
Enclosed in this message, you attach also a discount coupon that allows that entity to get better prices for
different items in your catalogue.

- Individual: 'Dear <nameOfCustomer>, We hope you and your family are enjoying your holidays, this is a 5% discount coupon'
- Private Institutions: 'Dear <nameOfCompany>, You have been a loyal client of this service, and we want to award you with this 5% discount coupon'
- Public Institutions: 'Dear <nameOfInstitution>, please find kindly attached a 10% discount coupon'

Design a system that will adapt for these requirements and will also embrace adding a new type of client called
- International Entity: 'Dear <nameOfEntity>, thanks for trusting our services. This is a 3% discount coupon on your next purchase'
