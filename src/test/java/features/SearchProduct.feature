Feature: Search and Place order for Product
@searchorder
Scenario Outline: Search experience for product search in both home and offers page
Given User is on Greenkart landing page
When User searched with shortname <Name> and extracted actual name of product
Then User searched for same shortname <Name> in offers page 
And validate the products of both the pages

Examples:
| Name |
| Tom  |
| Beet |
