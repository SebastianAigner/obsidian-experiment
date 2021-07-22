## Logging

The kotlin functions 'println' do not work, because it thinks it is on node.js. I assume that is somehow due to the locally running app. My solution so far is to use console.log instead.

## Testing

The gradle browserTest task will not run because it cannot find the obsidian library. Even if the classes under test do not need the library. 

A solution: If the tests do not require Obsidian, one can just copy the required files to a second project and test just fine.
