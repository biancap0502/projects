# Share surprises application

This application implements a mechanism for creating and managing a set of surprises. All of these surprises have a common behaviour by implementing the same interface.
 For sharing and generating surprises i've implemented a set of algorithms and a random mechanism. <br />
 This project uses concepts such as: inheritence, composion and aggregation, 
  design and use of interfaces to communicate between components, genericity etc.
  
  ## Implementation details
  
  ### 1. Types of surprises
  Each suprise implements ISurprise interface that contains the method enjoy (this methos "opens the surprise"). The surprises are implemented using the following classes: 
  FortuneCookie, Candies and MinionToy. Each class will implement a static method called generate() that will return a surprise of this type.
  
  ### 2. Storage of surprises
  All surprises will be stored in different types of containers and each container will implement IBag interface.
  <br /> The containers are:
  - random container: which will store surprises in random order
  - lifo container: which will store surprises using the LIFO principle 
  - fifo container: which will store surprises using the FIFO principle
  
  <br />  The class GatherSurprises is used to generate a set of random surprises by implementing the methods gather(int n) and gather().
  
  ### 3. Creating containers
  The class BagFactoryStorage that implements IBagFactory interface overrides the IBag makeBag(String type) which returns a new container depending on the type received.
  
  ### 4. Sharing surprises
  The abstract class AbstractGiveSurprises is used for sharing surprises and has methods such as: put(ISurprise), put(IBag), give(), giveAll() and the abstract method 
  giveWithPassion() that is implemented in each of the following classes: GiveSurpriseAndApplause, GiveSurpriseAndSing, GiveSurpriseAndHug and returns a suggestive message.
