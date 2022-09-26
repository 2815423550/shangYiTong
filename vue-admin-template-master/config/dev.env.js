'use strict'
const merge = require('webpack-merge')
const prodEnv = require('./prod.env')

module.exports = merge(prodEnv, {
  NODE_ENV: '"development"',
  // 指定访问后端的接口路径
  BASE_API: '"http://localhost:80"',
  // 如果是80端口可以省略不写，可以直接写成http://localhost
  // BASE_API: '"https://easy-mock.com/mock/5950a2419adc231f356a6636/vue-admin"',

})
