let UserAdminForm = document.getElementById("UserAdminForm");


UserAdminForm.addEventListener("submit", async function(e)
{
    e.preventDefault();

    console.log("Hi");
    let Data = {
        pic:e.target[0].value,
        name:e.target[1].value,
        age:e.target[2].value,
    }
    console.log(Data);

    let Res = await fetch("http://localhost:8080/users", {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify(Data)
    });
    // Res = await Res.json();
    // console.log(Res);


})