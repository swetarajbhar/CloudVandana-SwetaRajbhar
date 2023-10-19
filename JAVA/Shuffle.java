public class Shuffle {

    // Function to shuffle the array
    static void shuffleFunction(int[] inputArr) {
        int n = inputArr.length;
        for (int i = n - 1; i > 0; i--) {
            // Generate a random index within the remaining unshuffled elements
            int j = (int) (Math.random() * (i + 1));
            // Swap the current element (array[i]) with a random element (array[j])
            int temp = inputArr[i];
            inputArr[i] = inputArr[j];
            inputArr[j] = temp;
        }
    }

    // Function to print the shuffled array
    static void printArray(int[] inputArr) {
        System.out.print("Shuffled Array: ");
        for (int element : inputArr) {
            System.out.print(element + " ");
        }
    }

    public static void main(String[] args) {

        // Create an array with the values (1, 2, 3, 4, 5, 6, 7)
        int[] inputArr = new int[] { 1, 2, 3, 4, 5, 6, 7 };

        // Shuffle the array
        shuffleFunction(inputArr);

        // Print the shuffled array
        printArray(inputArr);
    }
}