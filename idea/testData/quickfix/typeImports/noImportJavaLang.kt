// "Remove initializer from property" "true"
package a

class M {
    interface A {
        abstract val e = <caret>Thread()
    }
}