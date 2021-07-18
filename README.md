## Testing

The gradle browserTest task will not run because it cannot find the obsidian library. Even if the classes under test do not need the library. 

A solution: If the tests do not require Obsidian, one can just copy the required files to a second project and test just fine.
