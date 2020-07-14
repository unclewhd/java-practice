let buttonElement = document.querySelector("button");
function onclick(ev) {
    // 有用户点击 button，我们发起 ajax
    let xhr = new XMLHttpRequest();
    xhr.open("get", "/api/article-list.json");
    xhr.send();
}

// 如果在 button 这个标签上，发生了 click（点击）事件，请执行 onclick 函数
// 每次用户点击 button，就允许 onclick 方法
buttonElement.addEventListener("click", onclick);