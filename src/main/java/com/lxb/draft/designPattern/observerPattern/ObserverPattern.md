### 观察者模式
观察者模式定义了对象之间的一对多依赖，这样一来，当一个对象改变状态时，它当所有依赖者都会收到通知并自动更新。

- 设计原则
    - 为了交互对象之间都松耦合设计而努力：将 Subject 和 Observer 松耦合，这样它们仍然可以交互，但是不清楚彼此的细节，因此在添加新的观察者时，不会对主题有影响