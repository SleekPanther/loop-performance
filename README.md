# Java Loop Performance with i++ & ++i
A simple demonstration of testing the runtimes of pre and post increment operators when applies to loops

Theoretically, `++i` should be faster as it doesn't need to copy the value, just increment it. `i++` fetches `i`, copies it, increments it & returns the copy.
**But this doesn't always work. Sometimes the difference (post - pre) calculated is negative, indicating the `i++` post incrementing was faster**

All times in **nanoseconds**
