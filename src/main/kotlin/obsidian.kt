@file:JsModule("obsidian")
@file:JsNonModule

open external class Component {
    open fun onload()
    open fun onunload()
}

open external class Plugin : Component {
}

open external class Notice(message: String, timeout: Number = definedExternally) {
    open fun hide()
}