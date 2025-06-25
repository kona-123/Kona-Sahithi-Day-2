# Kona-Sahithi-Day-2
1.ArrayList<Student>
* Dynamic array that resizes automatically when more students are added.

* Fast random access (get(index)) – ideal for iterating or displaying lists.
* Add operations at the end are amortized O(1) – efficient for new enrollments.

* Remove or insert in the middle is O(n) due to shifting – acceptable for small-to-medium lists 

2.When to use?
* HashMap<Integer, Student>
Optimal for fast ID lookups: direct access via key → O(1) lookup .
* Does not maintain ordered list – can’t easily display all students in insertion order unless paired with a list.
* Great for scenarios with large datasets and frequent searches by ID.

3. Real World  Takeaway
| Scenario                        | Best Structure                |
| ------------------------------- | ----------------------------- |
| Manage moderate class size      | *ArrayList*                 |
| Frequent ID-based search        | *HashMap*                   |
| Maintaining order + fast access | *ArrayList + HashMap* combo |

4. Conclusion
* ArrayList<Student> is an excellent, simple choice for CRUD functionality in small-to-medium applications.
* For large-scale systems or heavy ID lookups, consider adding a HashMap<Integer, Student> for efficient direct access.
