const asyncHandler = require("express-async-handler");
const User = require("../models/userModel");
require("dotenv").config();

/**
 * 사용자 등록
 */

//@desc Register Page
//@route GET /register
const getRegister = (req, res) => {
  res.render("register");
};

// @desc Register user
// @route POST /register
const registerUser = asyncHandler(async (req, res) => {
  const { username, password, password2 } = req.body;
  if (password === password2) {

    const user = await User.create({ username, password: password });
    return res.status(201).json({ message: "Register successful", user });
  } else {
    return res.send("Register Failed");
  }
});

/**
 * 사용자 로그인 / 로그아웃
 */

//@desc Get login page
//@route GET /
const getLogin = (req, res) => {
  res.render("home");
};

//@desc Login user
//@route POST /
const loginUser = asyncHandler(async (req, res) => {
  const { username, password } = req.body;

  const user = await User.findOne({ username });

  if (!user) {
    return res.status(401).json({ message: "일치하는 사용자가 없습니다." });
  }

  const isMatch = (password== user.password)?true:false;

  if (!isMatch) {
    return res.status(401).json({ message: "비밀번호가 일치하지 않습니다." });
  }

  res.redirect("/contacts");
});

// @desc Logout
// @route GET /logout
const logout = (req, res) => {

  res.redirect("/");
};

module.exports = { getRegister, registerUser, getLogin, loginUser, logout };