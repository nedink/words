<template>
  <div id="app">
    <words/>
  </div>
</template>

<script>
import Words from './components/Words.vue';

export default {
  name: 'app',
  components: {
    Words
  }
}
</script>

<style>
* {
  box-sizing: border-box;
  color: #cdcfe0;
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
}
:root {
  background-color: #2c3e50;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  margin-top: 60px;
}
*:focus {
  transition-duration: 100ms;
  box-shadow: 0 0 0 4px #00ff0080;
  color: #f1f1f7;
}
*:hover {
  color: #f1f1f7;
}
input {
  font-size: 1rem;
  background-color: #1f252b;
    color: #f1f1f7;
border: none;
  border-radius: 0.25rem;
  outline: none;
  height: 38px;
  padding: 0.5rem;
}
button {
  font-size: 1rem;
  background-color: #1f252b;
  border: none;
  border-radius: 0.25rem;
  outline: none;
  cursor: pointer;
  height: 38px;
  padding: 0.5rem 1.5rem;
}
button:hover {
}
#app {

}
</style>
