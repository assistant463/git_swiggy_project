Feature: a user should be able to order Pizza from Swiggy
@pizza
Scenario: Order Pizza From Swiggy
Given a user is on the home of Swiggy

When he Enter location as "<city>"
And he select first location from suggested location in suggestion-box
And he redirects to ItemPage
And he hover over search icon
And he Enter Item as "pizza"
And he select first suggested Item in pizza cateogory
And he search restaurant and select first restaurant
And he redirects to orderPage
And he add first item to cart
And he click on checkout button
Then he should be able to order a pizza suscessfully

Examples:
|city|
|Bangalore|
|Tamilnadu|