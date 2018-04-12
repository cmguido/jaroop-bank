# jaroop-bank

#### approach to problem:
  From afar I had a plan written out that involved using a series of methods and functions to determine which transaction was taking place based off of what the user entered from the keyboard.
  
  The next step was to access and traverse the HTML elements to find where to deposit, withdraw, and add sums to print a balance for the user. I picked Jsoup for this because as far as I could tell from reading it seemed to be the most reputable and easy to library to use in order to access HTML/DOM elements. It was similar to JQuery/JavaScript which helped in navigating how I was going to get certain elements, but ultimately I was not able to pull the values, convert them to Integers and place them into an array that could be iterated over.

I've commented my code as well to the best of my understanding about java, which I have never used before.


Steps to use:
- Copy this project or download it to your desktop or wherever you want to access it
- Download and install Java (I installed the newest version) and then follow the directions
- Download and install JSoup if you don't have it - this jar file should live in the jaroop-bank folder.

- After those installations are complete, you must compile and run the program. In order to do so with JSoup without an IDE
you must run:
java -cp "/Your/File/Path/To/jaroop_assessment/jsoup-1.11.2 .jar:." Bank

  - the easiest way is to copy the file path to the jsoup jar file, it should look like
         <java -cp "filepath:." Bank>

# NOTES
It currently only superficially desposits and withdraws.
Balance will show you the values for the tables, but will not sum them.

