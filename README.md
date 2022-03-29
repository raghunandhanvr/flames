# How FLAMES and this Program Works

## What is FlamesGame?
FlamesGame is a relationship calculating algorithm famous between the youngsters. At the time of graduation everyone might heard about this and many of them tried out this secretly. Some took this as very serious also. So what FLAMES stance for?
- F - Friendship
- L - Love
- A - Affection
- M - Marriage
- E - Enemy
- S - Sister (Sibling)

## How we can calculate the FLAMES?

It is very easy to explain with some example:
Your name: asd
Partner name: abcd

Mainly two steps are there:
1. Get the flames count
  - Take the two names ('asd' and 'abcd')
  - Remove the common characters (two common characters 'a', 'd')
  - Get the count of the characters that are left (Removed a,d and the rest are s,b,c. So total 3.)
2. Get the flames result
  - We take FLAMES letters ('F', 'L', 'A', 'M', 'E', 'S')
  - And start removing letters using the flames count we got.
  - And the letter which last the process is the result.

In our example we got flames count = 3. So first we takes FLAMES.
FLAMES
Then we start count from left up to flames count 3. Then remove the letter which is in the position 3. In this case it is 'A'. So the letters become:
FLMES
Then we start count again from the letter which is removed ie, from 'M'. So the next character to remove is 'S'. So our letters become:
FLME
After next step:
FLE
Then:
FE
Last:
F
So the result is 'Friend'.
