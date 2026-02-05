const subjects = [
    {name:"java"},
    {name:"c++"},
    {name:"python"},
    {name:"javascript"},
]

function getSubject(){
    setTimeout(()=>{
        let res=''
        subjects.forEach((sub,index)=>{
            res+=`<li>${sub.name}</li>`
        })
        document.body.innerHTML=res
    }, 1500)

    
}

function addSubject(sub){
    setTimeout(()=>{
        subjects.push(sub)

    },2000)
}

getSubject()
addSubject({name:"scala"})