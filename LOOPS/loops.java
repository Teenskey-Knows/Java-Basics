/*
 

FOR LOOPS

Use when you know the exact number of iterations.

for (int i = 0; i < 5; i++) {
    // Code to be executed
}


WHILE LOOPS

Use when the number of iterations is not known in advance but depends on a condition.


int i = 0;
while (i < 5) {
    // Code to be executed
    i++;
}




DO WHILE LOOPS


Use when you want to ensure the code inside the loop is executed at least once


int i = 0;
do {
    // Code to be executed
    i++;
} while (i < 5);





ENHANCED FOR LOOPS (FOR EACH LOOP)


Use when iterating through arrays or collections.


int[] numbers = {1, 2, 3, 4, 5};
for (int num : numbers) {
    // Code to be executed for each element
}



NESTED LOOPS

for (int i = 0; i < 3; i++) {
    for (int j = 0; j < 3; j++) {
        // Code to be executed for each combination of i and j
    }
}





BREAK AND CONTINUE STATEMENTS


for (int i = 0; i < 10; i++) {
    if (i == 5) {
        break; // Exit the loop when i is 5
    }

    if (i % 2 == 0) {
        continue; // Skip even numbers and continue to the next iteration
    }

    System.out.println("i is: " + i);
}




 */