/**
 * The "primeopti" class in Java checks if a given number is prime or not.
 */
public class primeopti {
<<<<<<<<<<<<<  ✨ Codeium AI Suggestion  >>>>>>>>>>>>>>
-public static boolean isprime(int n) {
-    if (n == 2) {
-        return true;
-    }
-
-    for (int i = 2; i <= Math.sqrt(n); i++) {
-        if (n % i == 0) {
-            return false;
-        }
-    }
-    return true;
+/**
+ * Checks if a given number is prime.
+ * @param n The number to be checked.
+ * @return True if the number is prime, false otherwise.
+ */
+public static boolean isPrime(int n) {
+    // Check if the number is 2
+    if (n == 2) {
+        return true;
+    }
+
+    // Check if the number is divisible by any number from 2 to the square root of n
+    for (int i = 2; i <= Math.sqrt(n); i++) {
+        if (n % i == 0) {
+            return false;
+        }
+    }
+    return true;
}
<<<<<  bot-2f66f715-87f5-4f85-b36c-e54b8064da09  >>>>>

    public static void main(String[] args) {
        System.out.println(isprime(15));
    }
}