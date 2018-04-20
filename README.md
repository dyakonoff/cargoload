# Spaceship loading application
This is an example of validation and discrete optimisation for [CUBA](https://www.cuba-platform.com/) application.

## Introduction
This application shows different ways how to make data and user input validation with CUBA framework.

Application acts like a simple cargo management system for a famous spaceship ["Millenium Falcon"](http://starwars.wikia.com/wiki/Millennium_Falcon)
from Star Wars universe. This is a pretty small ship ([see scheme](https://www.reddit.com/r/StarWars/comments/3mbwxu/star_wars_millennium_falcon_floor_plan/)) 
and it has only 6 cargo bays with total loading capacity of 30 - 100 tons. So, let's imagine that we are building a system 
to help [Han Solo](http://starwars.wikia.com/wiki/Han_Solo) and his crew to handle all that containers, boxes, tanks and 
parcels that his ship moves around the galaxy far, far away.

## Validators
### Ship
* Ship.type should be equal to one of the [YT-series ships](http://starwars.wikia.com/wiki/YT-series).
* Carrying capacity limits should conform to the ship class and be greater than 0.

_Note: Both these limits should be got from a middleware service bean (assume it gets it with an external API call from somewhere else)_

* Ship name should not contain english swear words.
_(Good example of bad words filter could be found [here](https://gist.github.com/PimDeWitte/c04cc17bc5fa9d7e3aee6670d4105941).)_

### Product
* Weight per unit can not be negative.
* Price per unit should be positive.

### CargoSku
* Product quantity should be >= 0.
* Quantity available for purchase can't be negative.
* Price should be auto-calculated.
* Container dimensions should be between 0 and 500 meters.

### CargoBay
* Cargo bay area can not be negative or exceed 900 sq. meters.
* Bay number should be positive.
* Maximum Load of the bay should not exceed the ship's carrying capacity.









