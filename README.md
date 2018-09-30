# PY-NOVEL

看小说。

# 技术栈

Python+Vue+微信小程序。

- [ ] Python：转换数据接口。笔趣阁广告多、排版也很简陋，http请求返回的响应是 html 字符串，通过 Python 做中间层处理，正则表达式匹配 Html 字符串中有用的数据：小说名称、作者、内容等信息，提供统一的数据接口，为 Web 端和移动端提供数据来源；
- [ ] Vue：Web 端展示选用 Vue 框架；
- [ ] 微信小程序：看小说大多数情况还是在手机上看的，移动客户端再开发一个微信小程序端；

# 目录结构

```
|-- py-novel
    |-- server              # python 提供数据接口
    |-- web-client          # web 客户端
    |-- miniapp-clent       # 微信小程序客户端
```
