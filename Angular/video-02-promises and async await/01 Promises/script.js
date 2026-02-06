// Using promises

const subjects = [
    { name: "java" },
    { name: "c++" },
    { name: "js" },
    { name: "python" }
]

const getSubject = () => {
    setTimeout(() => {
        res = ''
        subjects.forEach((sub, index) => {
            res += `<li>${sub.name}</li>`
        })

        document.body.innerHTML = res
    }, 1500)
}

const addSubject = (sub)=>{
    return new Promise((resolve, reject) => {  // promise
        setTimeout(()=>{
            subjects.push(sub)

            let err=false

            if(!err){       // if resolve
                resolve()
            }
            else{                // if reject
                reject("Unable to add subject")
            }
        },2000)
    })
}

addSubject({name:"kotlin"})
    .then(getSubject)       // if no error
    .catch((reason)=>{      // if error then executes
        console.log("The reason of error is: "+reason)
    })
    .finally(()=>{                      // always executes
        console.log("I am done processong")
    })