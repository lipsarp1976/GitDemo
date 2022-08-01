Feature: Search and Place order for Product
@placeorder
Scenario Outline: Search experience for product search in both home and offers page

Given User is on Greenkart landing page
When User searched with shortname <Name> and extracted actual name of product
And Added "3" items of the selected to cart
Then User proceeds to Checkout and validate the <Name> in checkout page
And verify user has ability to enter promo code and place the order

Examples:
| Name |
| Tom  |