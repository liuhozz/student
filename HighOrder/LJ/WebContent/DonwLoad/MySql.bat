@echo off &title ������ر�MySQL����(author:Bing)
for /f "skip=3 tokens=4" %%i in ('sc query MySQL') do set "zt=%%i" &goto :next
:next
if /i "%zt%"=="RUNNING" (goto 1)
if /i "%zt%"=="STOPPED" (goto 2)
:1
echo MySQL���������У����ڽ�ֹͣ����...
net stop MySQL

exit
 
:2
echo MySQL�������ڴ���ֹͣ״̬,����������...
net start MySQL
exit
pause>null