//SELECT 
//    Department.name, 
//    COUNT(Employee.id)
//FROM 
//    Department
//LEFT JOIN 
//    Employee ON Department.dept_id = Employee.dept_id
//GROUP BY 
//    Department.dept_id, 
//    Department.name
//ORDER BY 
//    COUNT(Employee.id) DESC, 
//    Department.name



//SELECT ID, FIRST_NAME, LAST_NAME FROM CUSTOMER WHERE LENGTH("FIRST_NAME")+ LENGTH("LAST_NAME")<12 AND ORDERBY LENGTH("FIRST_NAME")+ LENGTH("LAST_NAME"), FIRST_NAME, ID;


//SELECT * from ORDERS where status not in ('Delivered')