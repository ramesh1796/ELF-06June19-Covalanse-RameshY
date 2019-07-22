
function calC(c) {

    form.panel.value = form.panel.value + c;
}

function CE() {
  
    form.panel.value = "";
}

function back() {
    // let value = document.getElementById("d").value;
    //document.getElementById("d").value = value.substr(0, value.length - 1);
    form.panel.value =form.panel.value.substr(0,  form.panel.value.length - 1);
}