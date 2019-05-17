# 在线考试支持系统

系统基于WEB，稳定，快速，支持200人以下同时参加考试。

##### 成员

- 118037930074 侯国鑫
- 118037910028 雷连松
- 118037910071 周小帆

### CI/CD
- url: http://155.138.199.76:8082/
- tool: drone

![image](https://github.com/Ddd1101/SoftwareInnovate_2019Spring/blob/develop/image/WX20190423-205903.png)

### 功能需求

#### 邮件推送

- 考试之前将学生访问考试的密码发送到学生邮箱（学生注册时自行给出和验证）。
- 考试完成之后，将考试结果发送到上述的同一邮箱。

#### 试卷导入

- 导入的格式由excel 模板给出，该模板可以下载。
- 导入之后以足够灵活的方式保存试题，支持每次考试试题顺序随机排列，每个试题下面答案顺序随机排列。

#### 创建考试

- 设定试题数
- 设定每个试题分值
- 设定考试的起始日期和结束日期。
- 设定参加考试的人员名单。要求必须包含邮件地址。
- 考生名单支持以固定格式Excel导入。以班级名或者年级名进行分组。

#### 自动生成试卷

- 当考生选择开始考试的时候，支持试卷自动生成。
- 从题库当中随机选择试题。
- 每个试题下的备选答案随机生成，支持多选题。


#### 考试过程支持

- 显示考题，备选答案用复选框做成列表。
- 记录考生每个考题的选择结果。
- 支持考题标注功能，在考试正式提交考试结果之前，标注后的考题以特殊的颜色显示，供考试进一步思考。
- 在最终提交考试结果之前，给出一个汇总页面，该页面上给出考试题号和考生选择的答案。在题号上给出超链接，点击超链接即可返回原来的试题。
- 每个试题页面都支持超链接跳转到汇总页面。

#### 考试之后

- 自动统计每个考生的成绩。
- 保存考生的考试成绩，按照模板固定格式生成参加考试的所有人员的成绩单。在规定的期限内未参加考试，算弃考，没有成绩。
- 保存每个考生考试的题目列表、每个题目的备选答案列表以及考生选择的答案，必要时，生成包含考生基本信息（姓名、学号、考试科目）、考试的题目、每个题目的备选答案以及考生选择的答案的试卷。
- 支持个别生成试卷，也支持批量生成试卷。
- 支持考前生成试卷，也支持考后生成试卷，考前生成的试卷只有考题和备选答案，考后生成的试卷包含考生选择的答案。
