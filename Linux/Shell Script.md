运行 Shell 脚本有两种方法：
1、作为可执行程序
将上面的代码保存为 test.sh，并 cd 到相应目录：
chmod +x ./test.sh  #使脚本具有执行权限
./test.sh  #执行脚本
注意，一定要写成 ./test.sh，而不是 test.sh，运行其它二进制的程序也一样，直接写 test.sh，linux 系统会去 PATH 里寻找有没有叫 test.sh 的，而只有 /bin, /sbin, /usr/bin，/usr/sbin 等在 PATH 里，你的当前目录通常不在 PATH 里，所以写成 test.sh 是会找不到命令的，要用 ./test.sh 告诉系统说，就在当前目录找。
2、作为解释器参数
这种运行方式是，直接运行解释器，其参数就是 shell 脚本的文件名，如：
/bin/sh test.sh
/bin/php test.php

Shell 变量
定义变量时，变量名不加美元符号（$，PHP语言中变量需要），如：
your_name="runoob.com"
使用一个定义过的变量，只要在变量名前面加美元符号即可，如：
echo $your_name
使用 readonly 命令可以将变量定义为只读变量，只读变量的值不能被改变。
使用 unset 命令可以删除变量。语法：
unset variable_name

Shell 数组
bash支持一维数组（不支持多维数组），并且没有限定数组的大小。
类似与C语言，数组元素的下标由0开始编号。获取数组中的元素要利用下标，下标可以是整数或算术表达式，其值应大于或等于0。
在Shell中，用括号来表示数组，数组元素用"空格"符号分割开。定义数组的一般形式为：
array_name=(value0 value1 value2 value3)
读取数组元素值的一般格式是：
${array_name[index]}

Shell 传递参数
我们可以在执行 Shell 脚本时，向脚本传递参数，脚本内获取参数的格式为：$n。n 代表一个数字，1 为执行脚本的第一个参数，2 为执行脚本的第二个参数，以此类推……
以下实例我们向脚本传递三个参数，并分别输出，其中 $0 为执行的文件名：
echo "Shell 传递参数实例！";
echo "执行的文件名：$0";
echo "第一个参数为：$1";
echo "第二个参数为：$2";
echo "第三个参数为：$3";

Shell 函数
linux shell 可以用户定义函数，然后在shell脚本中可以随便调用。
shell中函数的定义格式如下：
[ function ] funname [()]
{
    action;
    [return int;]
}
说明：
1、可以带function fun() 定义，也可以直接fun() 定义,不带任何参数。
2、参数返回，可以显示加：return 返回，如果不加，将以最后一条命令运行结果，作为返回值。 return后跟数值n(0-255

输出重定向
重定向一般通过在命令间插入特定的符号来实现。特别的，这些符号的语法如下所示:
command1 > file1
上面这个命令执行command1然后将输出的内容存入,注意任何file1内的已经存在的内容将被新内容替代。如果要将新内容添加在文件末尾，请使用>>操作符。
输入重定向
和输出重定向一样，Unix 命令也可以从文件获取输入，语法为：
command1 < file1
这样，本来需要从键盘获取输入的命令会转移到文件读取内容
重定向深入讲解
一般情况下，每个 Unix/Linux 命令运行时都会打开三个文件：
标准输入文件(stdin)：stdin的文件描述符为0，Unix程序默认从stdin读取数据。
标准输出文件(stdout)：stdout 的文件描述符为1，Unix程序默认向stdout输出数据。
标准错误文件(stderr)：stderr的文件描述符为2，Unix程序会向stderr流中写入错误信息。