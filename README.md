# Test for Deutche Bank

I would like to highlight a few points:

1) Were used Java11, SpringBoot
2) `class Algo` and `interface SignalHandler` were moved to a separate library as .jar
3) There are two layers of the application : `SignalController` - controller, `AlgoServiceImpl` - main service, that handles  signals
4) As there were no requirements on what to do, when smth except 1-3 is requested, exception is throwed ( this is a good question, that i had to ask :) )

### Main Idea

1) Each signal is associated with one service by an enum, which holds the number of a signal. 
As there can be thousands of such signals (and enums), enums can be divided by groups (I created AwesomeGroup for signal 1, 2 and PerfectGroup,
ofc there should more approparete names of such groups depending of logic of algorithms). This was made possible by inheritance of interface `SignalNumber` by enums.
Static final field `usedNumbers` in the interface `SignalNumber` that is thread safe HashSet helps to detect if more than one service assosiated with a signal.

2) All services that handle signals are autowired to the main service `AlgoServiceImpl` and tranfered to the map. It helps to find a necessary service with O(1).


P.S. Unfortunately, I don't have enough time to add unit tests, even though I understand how important they are :(
