### java.util.Observable
Observer 和 Observable 是 Java 内置对观察者模式，不过这个在 Java 9 已经被弃用了，原因是这个事件模型太具局限性，如果依赖于 Observable 通知对次序，会发现和原本对顺序不同，这样的话，一旦 Observer or Observable 的实现有改变，那么通知次序就会改变，就有可能产生错误。
```
 * @deprecated
 * This class and the {@link Observer} interface have been deprecated.
 * The event model supported by {@code Observer} and {@code Observable}
 * is quite limited, the order of notifications delivered by
 * {@code Observable} is unspecified, and state changes are not in
 * one-for-one correspondence with notifications.
 * For a richer event model, consider using the
 * {@link java.beans} package.  For reliable and ordered
 * messaging among threads, consider using one of the concurrent data
 * structures in the {@link java.util.concurrent} package.
 * For reactive streams style programming, see the
 * {@link java.util.concurrent.Flow} API.
```
除此之外，Observable 还是一个类，并非接口，所以如果还需要继承其他类时，就受到了限制。

并且，Observable 的 setChanged() 是 protected 方法，因此只能通过继承 Observable 才能使用它，这样就不能通过组合的方式使将 Observable 组合到自己的对象中。