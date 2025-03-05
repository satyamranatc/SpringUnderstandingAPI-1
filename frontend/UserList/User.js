let UserCards = document.getElementById("UserCards");

async function GetData()
{
    let Res = await fetch("http://localhost:8080/users");
    let Data = await Res.json();
    
    for(let i of Data)
    {
        UserCards.innerHTML += `
         <div class="UserCard">
                <img src="${i.pic}">
                <h2>${i.name}</h2>
                <p>${i.age}</p>
                <button>Contact</button>
            </div>
        `
    }
}

GetData();