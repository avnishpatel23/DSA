/* HOLLOW RECTANGLE

public class HollowRectangle {
    public static void main(String[] args) {
        int rows = 4; // Number of rows
        int cols = 5; // Number of columns

        for (int i = 0; i < rows; i++) {
            if (i == 0 || i == rows - 1) {
                // Print the top or bottom row
                for (int j = 0; j < cols; j++) {
                    System.out.print("*");
                }
            } else {
                // Print the middle rows
                System.out.print("*"); // Start of row
                for (int j = 0; j < cols - 2; j++) {
                    System.out.print(" "); // Spaces in between
                }
                System.out.print("*"); // End of row
            }
            System.out.println(); // Move to the next line
        }
    }
}


*/


/*   HALF PYRAMID 


public class RightAlignedHalfPyramid {
    public static void main(String[] args) {
        int n = 4; // Number of rows

        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Move to the next line
            System.out.println();
        }
    }
}


*/

/* Inverted Half Pyramid
public class InvertedHalfPyramidNumbers {
    public static void main(String[] args) {
        int n = 5; // Number of rows

        for (int i = n; i >= 1; i--) {
            // Print numbers for each row
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            // Move to the next line
            System.out.println();
        }
    }
}

*/

/* Floyds Triangle

public class FloydsTriangle {
    public static void main(String[] args) {
        int n = 5; // Number of rows
        int num = 1; // Starting number

        for (int i = 1; i <= n; i++) {
            // Print numbers in each row
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++; // Increment the number
            }
            // Move to the next line
            System.out.println();
        }
    }
}


*/



/* Zero One Triangle

public class ZeroOneTriangle {
    public static void main(String[] args) {
        int n = 5; // Number of rows

        for (int i = 1; i <= n; i++) {
            int start = (i % 2 == 0) ? 0 : 1; // Alternate starting value for rows

            for (int j = 1; j <= i; j++) {
                System.out.print(start + " ");
                start = 1 - start; // Toggle between 0 and 1
            }
            // Move to the next line
            System.out.println();
        }
    }
}


*/


/* Butterfly Pattern


public class ButterflyPattern {
    public static void main(String[] args) {
        int n = 5; // Number of rows

        // Top half of the butterfly
        for (int i = 1; i <= n; i++) {
            // Print left stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Print spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // Print right stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Move to the next line
            System.out.println();
        }

        // Bottom half of the butterfly
        for (int i = n; i >= 1; i--) {
            // Print left stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Print spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // Print right stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Move to the next line
            System.out.println();
        }
    }
}



*/

/* Solid Rhombus

public class SolidRhombus{
    public static void main(String[] args) {
        int n = 5; // Number of rows

        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            // Move to the next line
            System.out.println();
        }
    }
}

*/


/* Hollow Rhombus


public class HollowRhombus {
    public static void main(String[] args) {
        int n = 5; // Number of rows

        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print stars and spaces
            for (int j = 1; j <= n; j++) {
                // Print stars at the border or first/last position
                if (j == 1 || j == n || i == 1 || i == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            // Move to the next line
            System.out.println();
        }
    }
}


*/


/* Diamond Pattern

public class DiamondPattern {
    public static void main(String[] args) {
        int n = 5; // Number of rows (half of the diamond)

        // Top half of the diamond (pyramid)
        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            // Move to the next line
            System.out.println();
        }

        // Bottom half of the diamond (inverted pyramid)
        for (int i = n - 1; i >= 1; i--) {
            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            // Move to the next line
            System.out.println();
        }
    }
}

*/


/* Number Pyramid 

public class NumberPyramid {
    public static void main(String[] args) {
        int n = 5; // Number of rows

        for (int i = 1; i <= n; i++) {
            // Print leading spaces for centering
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print the number 'i', repeated 'i' times
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }

            // Move to the next line
            System.out.println();
        }
    }
}


*/



// Palindromic Pattern

public class PalindromicPattern {
    public static void main(String[] args) {
        int n = 5; // Number of rows

        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print increasing numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // Print decreasing numbers
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }

            // Move to the next line
            System.out.println();
        }
    }
}
