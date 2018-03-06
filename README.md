## java-collection-operator 

#### 适用对象：

 没有Java经验的人快速验证自己是否已经具备了用Java基本语法进行编程的能力

#### 需求
+ 根据测试目录下的测试代码，完成实现使得测试代码可以运行通过。
+ 不修改测试代码，只修改实现代码，使得测试全部通过。

#### 目标
理解java 的基本语法，完成基本的集合运算

#### 答题流程
请用户仔细阅读题目要求和题目描述

+ 在命令行中使用以下命令在用户本地任意目录下clone此题目库

> git clone repo_of_this_template

NOTE：如果提示git命令未找到请先阅读参考资料

+ 用任意编辑器打开clone下来的文件夹，内部会存在两个文件夹
> test  //测试文件夹
  src   //源文件
请在src文件下的main.js文件内实现main函数

+ 完成函数后，使用以下命令设置github远程仓库地址 (my_url代表你自己的新的github地址)
 > git remote set-url origin my_url
 
+ 请使用git提交(commit)并上传(push)，之后将此github仓库地址(用户自建的) eg:（https://github.com/username/repo） 填入到提交地址一栏
+ 获取分支
+ 提交
+ 等待结果

#### 开始

+ git clone 后初次下载完需要安装依赖：

> ./gradlew build -x test

+ 运行测试：

> ./gradlew test  跑全部的测试
  完成一个函数的测试可以单独运行，推荐使用快捷键

注意：初次运行test 会发现测试失败 

执行gradle idea，然后idea .即可在Intellij IDEA中打开项目。