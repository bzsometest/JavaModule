# JavaModule
#### Java模块化系统，最小化打包。可运行在Windows，Linux系统。
#### 无需安装Java环境，打开文件夹即可执行项目。


打包命令：

    -p 打包后的jar文件路径 (待测试是否支持class二进制文件路径)
    --launcher 添加启动命令，格式： <启动命令>=<模块>[/<主类>]
    --output 必须指定，打包文件的输出路径
    jlink --add-modules module --output E:\dddd --launcher start=module/com.bzchao.module.ModuleTest
  
启动方式：

    执行：jlink打包后的目录/bin/<启动命令>
    或者：java -m 模块名/模块启动类
