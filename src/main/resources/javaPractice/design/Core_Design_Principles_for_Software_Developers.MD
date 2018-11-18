# Core Design Principles for Software Developers by Venkat Subramaniam
https://youtu.be/llGgO74uXMI

# What is a good design ?

  - A design is good if the cost of changing the design in minimum (Easy to change)
  - Impossible to get it done the first time, we will need few iterations. (Improve on what you have done)
  - Software is never written, it is always rewritten (Software is evolving)
# How to create good design
  - let go of the ego (We are not perfect).
  - Have the right amount of ego
  - Be unemotional. Get attached to the solution, not the problem.
  - There are two kinds of people that are dangerous to work with
    - Who can't follow instructions
    - Who can only follow instructions (Try to find better ideas)
  -  Take time to review design and code
     - by reviewing other's code we can also learn
# Keep is simple (KISS : keep it simple and stupid)
  - We shoud fear complexity, it makes codes dificult to change
  - Duplication and not able to maintain adds complexicity
  - Simple keeps us focused, emparative codes makes complexcity
  - Simple solves only real problem we know about (wait untill you know more to add more code)
  - Simple fails less (Robust)
  - Simple is easy to understand
# Complexity
  - Inherent
    - Complexity in the problem domain and we have deal with that
  - Accidental
    - Solutions bring complexity.  And we bring more complexity to solve those. (Concurrency -> treads -> ... )
  - Simple != familiar
    -  Simple means easy to understand. While loops are familiar, while loop with 4 mutable variables is not simple, it is just familiar
  - Goods deisgn hides the inherent comlexity and eliminates the accidential complexity
# Think YAGNI (You aren't gonna need it)
  - We tend to implement things we don't really need.
  - When should i implement something ?
  - How much do we know ? 
  - Cost of implementing.(Calculate cost of implementing now vs tomorrow. We will have more knowledge by tomorrow). procrastination is not postponing
  - Why don't we postpone ? https://youtu.be/llGgO74uXMI?t=1905 (We nood to have good test automation)
# Cohesion
  - Focused on doing one thing
  - Because we want to change software with less cost
  - Cohesive means less changes
  - Example : https://youtu.be/llGgO74uXMI?t=2279
# Coupling
  - What you depend on
  - inheritance is the worst form of coupling (java style)
  - try to see if you can remove coupling (http://blog.agiledeveloper.com/2009/10/try-to-knockout-before-you-consider-to.html)
  - Can't remove all the dependencies
    - get rid of it
    - Make it loose instead of tight
  - Depending on a class is tight coupling
  - Depending on an interface is loose coupling
  - A good design has high cohesion and low coupling
# DRY principle
  - Don't repeate !! (Don't duplicate code and effort)
  - If we change schema we have to change model, controller, UI  etc.. this is effort duplication
  - Doing same validation in client side and back end is code duplication (Doing same thing)
  - Every piece of Knowledge in a System should have a single unambiguous autherative representation  