# Prag
 An exploration of a self-styled pragmatic OOP language

Prag is a programming language with a very opinionated perspective. It's mostly an OOP language, but it's also a pragmatic language. Consequently you can get a lot of things done purely procedurally.


How I got here

I looked at a number of popular OOP languages and tried to understand their point of view on programming generally and OO programming in particular. I confess that I studied few of them in tremendous detail: there often came a point where I thought to myself "I'm done, and if takes another eight chapters for this to circle back to being straightforward again, I don't have the patience". With some I got as far as the first principles and knew it wasn't the language I was looking for (multiple inheritance, I'm looking at you). 

For several of the most popular I made a point of reading what other adopters, both promoters and detractors, of the language thought about it. Reading the kinds of questions users ask on StackOverflow and elsewhere also gives a good picture of a language; practitioners of one particular popular language seem to spend a lot of time explaining that they know exactly what they want to do, but they can't figure out the syntax that is acceptable to the compiler.

All of these languages left me wanting in one way or another. For example,

- The syntax of some explodes with punctuation marks of various kinds, making code very hard to read and understand. When you're using every punctuation mark on the keyboard, and some of them doubled, it's type to take a step back.

- The semantics of others becomes very hairy, for example trying to control explicitly the semantics and visibility of inheritance with private, public, protected, final, etc. modifiers.

- Some allow you to make common mistakes that they really shouldn't. As Tony Hoare once said, the author of a programming language is responsible for the common mistakes of its users.

- Others allow errors to occur at runtime that should have been caught at compile time, such as a method turning out to be virtual when it finally comes time to dispatch it. (The worst thing about that kind of problem is that it can lurk undetected in some obscure corner of the code, just waiting for some previously unseen case to trigger it.)

- Some place far too much mental burden on the programmer, e.g. to follow the chain of inheritance, to figure out what is going on in the code.

- Polymorphism and generics seem especially fraught with over-elaborate syntax, complex rules of interpretation, and the possibility of error. 


So I set out to design a language that I like, and maybe other people can tell me what's wrong with it and how it could be better. Some of my guiding principles were:

- Make it easy to write straightforward programs, or the straightforward parts of more complex programs. Say, as easy as writing beginner's Python, before you get to the part about objects. 

- Make it easy to write reusable code, without having to resort to reflection.

- Be pragmatic, not purist. 

- Make sophisticated things possible, but not at the cost of cluttering the simple ones.

- Keep the ontology as simple as possible, but no simpler. There should be very few categories of "things" and relations between  them.

- Respect the most fundamental principles of OOP, which in my mind are High Cohesion of components and Low Coupling between components. Everything else about OOP should be in the service of those goals, not fundamental goals in their own right.


There are lots of things Prag is not. It's not a systems language, like C or Rust. It's not a purist's language, like C#. It's not strongly opinionated about doing everything the OO way, like Java. It's not loose with types or implicit about interfaces, like Go or Python. It's definitely not an academic language. No language should try to be all things. Prag knows what it is about - and what it is not.
