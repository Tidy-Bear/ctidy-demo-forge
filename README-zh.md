# CTidy's Forge Demo （Forge Mod 开发模板）

CTidy（熊老师）自己的 Forge Mod 开发模板。具体开发时，请将 `mod_id`、`version`、`author`、`licence` 等内容修改为实际值。

## 预置组件
### 开发环境
- MinecraftForge
- SpongePowered Mixin
- ParchmentMC Mappings

### Mod 依赖
可以按需要自由增删。
- JEI (JustEnoughItems)
- JECh (JustEnoughCharacters)
- Jade
- Catalogue
- Configured
- Controlling
- Spark
- Xaero's Minimap
- Xaero's World Map

项目会自动导入 `<project_root>/libs` 目录下的所有 `.jar` 文件，并进行反混淆，除非这些 jar 包的文件名具有 `-sources.jar` 或者 `-local.jar` 后缀。

## 备注
推荐将 Mod 本身的代码（如 api）、依赖于原版 MC 的代码 以及 依赖于指定平台（如 Forge、Fabric 等）的代码相分离，即便本模板是 Forge 专供。
当实现某个功能用例时，尽量优先使用原版 MC 的代码，再考虑指定平台的 API，除非原版代码具有过于显著的缺陷，或者你准备好在每个平台上都进行一次实现。
