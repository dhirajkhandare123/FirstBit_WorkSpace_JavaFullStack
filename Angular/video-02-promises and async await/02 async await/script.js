const subjects = [
    { name: "java" },
    { name: "c++" },
    { name: "js" }
]

const getSubject = () => {
    setTimeout(() => {
        let res = ''

        subjects.forEach((sub, index) => {
            res += `<li>${sub.name}</li>`
        })

        document.body.innerHTML = res
    }, 1500)
}

const addSubject = (sub) => {
    return new Promise((resolve, reject) => {
        setTimeout(() => {

            let err = true
            subjects.push(sub)
            if (!err) {
                resolve()
            }
            else {
                reject("Unable to add subject")
            }
        }, 4000)
    })
}

async function initialize() {
    try{
        await addSubject({ name: "kotlin" })
        getSubject()
    }
    catch(err){
        console.log("There is issue: "+err)
    }
    finally{
        console.log("End of procesing........")
    }
}

initialize()