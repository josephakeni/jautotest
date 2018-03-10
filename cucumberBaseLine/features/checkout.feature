Feature: Cash Withdrawal
Scenario Outline: Withdraw fixed amount
Given I have <Balance> in my account
When I choose to withdraw the fixed amount of <Withdrawal>
Then I should <Outcome>
And the balance of my account should be <Remaining>
Examples: Successful withdrawal
| Balance | Withdrawal | Outcome | Remaining |
| $500 | $50 | receive $50 cash | $450 |
| $500 | $100 | receive $100 cash | $400 |
