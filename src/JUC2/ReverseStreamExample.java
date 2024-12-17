package JUC2;

import java.util.List;
import java.util.stream.Stream;

public class ReverseStreamExample {
    static class InvalidStreamTypeException extends RuntimeException {
        public InvalidStreamTypeException(String message) {
            super(message);
        }
    }

    public static <T> Stream<T> reverseStream(Stream<T> stream) {
        if (stream.anyMatch(item -> item instanceof String)) {
            throw new InvalidStreamTypeException("Stream contains string type");
        }

        List<T> fiteredList = stream.filter(
                item -> item instanceof Integer || item instanceof Long).toList();

        return fiteredList.stream();
    }
    public static void main(String[] args) {
        try {
            // Create a stream with Integer, Long, and String types
            Stream<Object> mixedStream = Stream.of(1, 2, 3, 100L, 200L, 400L);

            // Call reverseStream method and expect it to throw an exception due to String
            Stream<Object> reversedStream = reverseStream(mixedStream);

            // Collect the result into a list and print
            List<Object> result = reversedStream.toList();
            System.out.println("Reversed Stream: " + result);

        } catch (InvalidStreamTypeException e) {
            System.out.println(e.getMessage());
        }

    }
}
