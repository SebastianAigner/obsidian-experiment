@OptIn(ExperimentalJsExport::class)
@JsExport
@JsName("default")
class SomePlugin(
    app: Any,
    manifest: Any
) : Plugin(
    app,
    manifest
) {
    override fun onload() {
        Notice("This is a notice!")
    }

    override fun onunload() {
        Notice("Unloading plugin!")
    }
}

//fun main() {
//    js("module.exports = SomePlugin")
//}