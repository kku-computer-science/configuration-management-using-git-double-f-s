Team Workflow

Team Member
1.นายวัชรวิศว์ ชัยปลื้ม 663380023-1  (คนที่2) รับผิดชอบ Quick Sort
2.นางสาวอรจิรา แสนตา 663380244-5 (คนที่3) รับผิดชอบ Main/input และTeamworkFlow
3.นายเอกสิทธิ์ พินิจมนตรี 663380249-5(คนที่1) รับผิดชอบ Bubble Sort

ขั้นตอนการทำงานมีดังนี้ 
1.Setup ทำทีละคน 
คนที่1:สร้าง Repository จากลิงก์ Github Classroom เพิ่มสมาชิกและแก้ไขไฟล์ Readme.md
คนที่ 3: Clone งานลงเครื่อง สร้าง Folder ชื่อ AboutMyTeam และ Project สร้างไฟล์ TeamWorkflow.md ในโฟลเดอร์ AboutMyTeam  เขียนรายละเอียดสมาชิกและขั้นตอนการทำงานลงไปCommit ต้องใส่ข้อความว่า "Created TeamWorkflow.md" แล้วPush 
คนที่ 2:เข้าไปเช็คใน GitHub ว่าไฟล์มาครบไหม (Folders, Readme, TeamWorkflow)

2.Development 
ทุกคนแยกกันทำ : สร้าง Branch ของตัวเอง ชื่อ ชื่อจริง_รหัส4ตัวท้าย 
สร้างไฟล์ส่วนตัว ชื่อจริง_รหัส4ตัวท้าย.md ใส่ข้อมูลส่วนตัว
แบ่งงานเขียนโค้ด ในโฟลเดอร์ Project ตกลงกันว่าจะใช้ไฟล์ชื่อว่าอะไร (คุยอีกที)
คนที่ 1: เขียนฟังก์ชัน bubble_sort(data)
คนที่ 2: เขียนฟังก์ชัน quick_sort(data)
คนที่ 3: เขียนฟังก์ชัน main() ที่รับค่า Input, สร้างเมนูเลือก 1 หรือ 2, และเตรียมที่ว่างไว้เรียกฟังก์ชัน 
คนที่ 1 และ 2 เขียนแค่ฟังก์ชันของตัวเองลงในไฟล์ว่างๆ ก่อน ส่วนคนที่ 3 เขียนโครงหลัก Commit งานของตัวเองลง Branch ตัวเอง ทั้งไฟล์ .md ส่วนตัว และไฟล์ Code

3.Merge ทำทีละคน
คนที่ 3: Push Branch ตัวเอง ทำการ Merge Branch ตัวเองเข้า main 
คนที่ 1 Bubble Sort: Switch กลับมาที่ main ในเครื่องตัวเอง git pull ดึงโค้ดของคนที่ 3 มา Switch ไปที่ Branch ตัวเอง  git merge main (ผสมโค้ด) แก้ไขโค้ด: นำฟังก์ชัน bubble_sort ของ ไปแปะใส่ในไฟล์หลักที่คนที่ 3 ทำไว้ Push Branch ตัวเอง แล้ว Merge เข้า main 
คนที่ 2 Quick Sort:ทำเหมือนคนที่ 1 แก้ไขโค้ด: นำฟังก์ชัน quick_sort  ไปแปะใส่ในไฟล์หลัก (มีทั้ง Main และ Bubble Sort อยู๋) Push Branch แล้ว Merge เข้า main

4. Check
แต่ละคนลอง  git checkout main
git pull
โดยต้องมี:
Folder: AboutMyTeam --TeamWorkflow.md
Folder: Project (มี Source Code ครบ) ใช้ Main.java
File: README.md
File: ชื่อ_รหัส.md (ครบ 3 ไฟล์)
จากนั้นทดสอบรันโปรแกรมดูว่าทำงานถูกต้องตามโจทย์ไหม ถ้าถูกต้องก็เสร็จสมบูรณ์
