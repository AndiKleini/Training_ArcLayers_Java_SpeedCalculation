# Training_ArcLayers_Java_SpeedCalculation

In this session developers should refactor an existing application into seperate layers. The use case consists of requesting input data distance (meter) and time (second). 
Based on the input data the speed is calculated by the division meter / time and the result written
into a file. 

The initial version of the application is very simple and realized as console application. It also does not take care of separating the application in proper layers (e.g.
Presentation-, Backend- and Databaselayer).

Unfortunately we know that upcoming requirements will force us to exchange data storage (e.g.: usage of a special database) and frontend (e.g.: modern web app). 
Therefore clear interfaces and seperation of concerns seems convenient.

Let's do some refactoring in two steps to split up our application into proper layers.

## Split up presentation, calculation and storage in dedicated methods

The goal of this first refatoring step is creating dedicated methods for presentation, calculation and storage. 
One can review a proper solution on the branch "refactor_layers_as_methods".

## Move afore created methods to dedicated classes and apply interfaces

The goal of this second refatoring step is creating dedicated classes for presentation, calculation and storage. Additionally proper interfaces should be defined.
One can review a proper solution on the branch "refactor_layers_as_classes".
