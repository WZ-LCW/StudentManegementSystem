package main
import "fmt"
import "os"

var (
	allStudent map[int64]student    
  
)

 type student struct{
	 id int64
	 name string
	 building int64
	 room int64
 }
 func newStudent(id int64,name string,building int64,room int64)student  {
	 return student{
		id: id,
		name: name,
		building: building,
		room: room,
	 }
 }


 
	 func main(){
		allStudent =make(map[int64]student)
    
    for{
	fmt.Println(`Menu
  0.exit		
 1.insert
 2.show
 3.delete`)
 var command int
 fmt.Print("input your command:")
 fmt.Scanln(&command)
 fmt.Println("your command is %d",command)
switch command {
	case 0:
		exit()
	case 1:
		fmt.Println("insert command")
		insert()
	case 2:
		fmt.Println("show command")
		show()
	case 3:
		deleteStudent()
	default:
		fmt.Println("wrong command")
		
	
}}}

func exit(){
	fmt.Println("system is closed")
	os.Exit(1)
}
 
func insert(){
	var(
	 id int64
	 name string
	 building int64
	 room int64
	)
	fmt.Print("student's id:")
	fmt.Scanln(&id)
	fmt.Print("student's name:")
	fmt.Scanln(&name)
	fmt.Print("student's building:")
	fmt.Scanln(&building)
	fmt.Print("student's room:")
	fmt.Scanln(&room)
	NewStu := newStudent(id,name,building,room)
	allStudent[id]= NewStu

}

func show(){
for k,v:= range allStudent{
fmt.Println("学号：%d  名字：%s",k,v.name)

}
func deleteStudent(){
	var（
	deleteID int
	）

	fmt.Println("Delete number:")
	fmt.Scanln(&deleteID)
	delete(allStudent,deleteID)

}
}



